package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 날짜: 2019.10.24.
 * 이름: 황재호
 * 내용: 컬렉션 프레임워크 Set 실습하기 교재 p724
 */
public class SetTest {

	public static void main(String[] args) {
		
		//집합 생성 및 데이터 저장
		Set<Double> set = new HashSet<>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0); //2를 2개 넣음. 
		
		System.out.println("원소 개수: "+set.size()); // 2는 중복되므로 1개로 처리됨. 즉, 데이터 중복 허용 안함.
		
		//집합 원소 꺼내기
		Iterator<Double> it = set.iterator(); // 집합 원소를 추출해주는 반복자
		
		while(it.hasNext()) {
			System.out.println("원소: "+it.next());
		}
		
		
		
	}
}
