package book5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음.
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스
// 다 적고 생각 : 메인함수에는 아무런 영향이 없다. (메인함수는 수정 아무것도 안 함. 완벽하게 분리)

public class Handler {

   
   // 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다.)
   private ArrayList<Book> list = new ArrayList<>();
   
   /* 파일 저장 및 불러오기 함수*/
   private File f = new File("bookList.csv");
   
   public Handler() {
      if(f.exists() == false) {
         try {            
            f.createNewFile();
         }catch(IOException e) {
            System.out.println("\t파일을 생성하는데에 문제가 발생했습니다 : " + e);
            e.printStackTrace();
         }
      }
   }
   
   // 저장
   public void save() {
      try{
         // 프로그램의 데이터를 파일로 내보내는 스트림(데이터의 이동 통로)
         FileOutputStream fos = new FileOutputStream(f);
         
         // 스트림으로 문자열 형식 데이터를 전달하는 기능이 추가된 클래스
         OutputStreamWriter osw = new OutputStreamWriter(fos);
         
         for(Book ob : list) {
                                    // 리스트 내부의 객체를 대상으로 번복
                                    // 문자열로 저장할 것인가? 객체 그대로 직렬화해서 바이너리로 저장할 것인가 ?
                                    // 문자열로 저장하기 (메모장에서 열면 알아볼 수 있음)
            String name = ob.getName();
            String author = ob.getAuthor();
            String publisher = ob.getPublisher();
            String price = String.valueOf(ob.getPrice());
            
            // 아래 서식은 띄어쓰기 없이 콤마로만 구분하기
            // printf()와 동일하지만
            // printf는 모니터에 출력하는 역할
            // String.format()은 서식의 문자열을 만들어서 반환하는 역할
            String data = String.format("%s,%s,%s,%s", name, author, publisher, price);   // 여기서 포인트는 띄워쓰기 x
            osw.write(data);      // 반복하여 객체의 정보를 문자열로 기록한다.
            osw.write('\n');      // 한 줄당 하나의 객체정보를 저장하기 위해 개행문자를 추가한다.
         }// object ... args : 가변인자
         osw.flush();      // 버퍼에 남아있고, 아직 파일로 넘어가지 않은 데이터를 넘긴다.
         osw.close();      // 열려있는 데이터 이동 통로를 닫아준다.   (메모리 누수 방지, 필요없는 데이터에 의해 자원이 낭비되는 형태)
         
      }catch(IOException e) {
         e.printStackTrace();
      }
      
   }   // end of save()
   
   // 불러오기
   public void load() {
      try {
         Scanner sc = new Scanner(f);   // Scanner도 Reader 역할을 수행함.
                                 // (Reader와 Writer는 문자열을 대상으로 데이터 입출력을 수행)
         String data = "";            
         
         while(sc.hasNextLine()){      // 한 줄 단위 (저장할 때 한줄에 하나의 객체)로 읽어낸다.
            data = sc.nextLine();      // 처리하지 않은 다음 줄을 가져와서 data에 저장
            if(data.length() != 0) {   // 마지막에 그냥 엔터만 입력하면 한 줄은 있으나 내용이 없ㅇ르 수 있다.
               String[] arr = data.split(",");   // 콤마로 구분해서 기록했으니 불러올 때도 콤마로 분리한다.
               Book b = new Book();         // 비어있는 객체를 생성하고
               b.setName(arr[0]);            // 각 순번대로 값을 필드에 대입한다. (setter)
               b.setAuthor(arr[1]);
               b.setPublisher(arr[2]);
               b.setPrice(Integer.parseInt(arr[3]));   // 정수형은 WrapperClass를 활용한다.
               list.add(b);            // 값이 준비된 객체를 리스트에 추가한다.
            }
         }
         sc.close();   // 메모리 누수 방지를 위한 close()
      }catch(FileNotFoundException e) {
         e.printStackTrace();
      }
   }
   // 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
   public void showList() {   
      list.forEach(ob -> System.out.println(ob));
   }
   
   // 도서 추가
   public int insertBook(Book ob) {
      int row = 0;
      
//      for (int i = 0; i < arr.length; i++) {
//         if(arr[i] == null) {      // 빈칸을 찾았다면
//            arr[i] = ob;         // 값이 준비된 객체를 넣으면 끝.
//            row = 1;
//            break;      // 다음칸에 또 값을 넣으면 안 되니까 break(반복 중단)
//            
//            // 파랑색 변수 : 클래스의 멤버필드
//            // 갈색 변수 : 메인함수의 지역변수
//         }
//      }
      boolean flag = list.add(ob);   // 추가 성공하면 true가 반환된다.
      row = flag ? 1 : 0;            // true이면 row가 1, 아니면 row가 0
      
      return row;
   }
   
   // 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 삭제한다.
   int deleteBook(String name) {   // 책이 Book 타입 안에 있으니까 !!
      int row = 0;
//      for (int i = 0; i < arr.length; i++) {
//         if(arr[i] != null && arr[i].getName().equals(name)) {
//            // arr[i] != null은 NullPointException을 방지하기 위해서 !
//            arr[i] = null;   // 참조변수가 객체를 참조하지 않도록 한다.
//                        // 모두에게서 잊혀진 참조변수는 소멸한다.
//            row = 1;      // 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다.
//            break;         // 하나 지웠으면 중단한다.
//            
//         }
//      }
      
      // 조건에 맞는 요소를 삭제하는 리스트의 함수 (반환값은 boolean 타입)
      boolean flag = list.removeIf(ob -> ob.getName().equals(name));
      // removeIf는 조건에 맞는 요소들을 찾아서 다 지운다.
      // 그래서 기본키가 필요하다는 생각을 머릿속에 생각을 해야한다.
      row = flag ? 1 : 0;
      return row;
   }
}