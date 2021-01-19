import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String UltimaLang1 = (String) ListUtil.getUltimo1(langs);
		System.out.println(UltimaLang1);
		
		Integer UltimoNums = (Integer) ListUtil.getUltimo2(nums);
		System.out.println(UltimoNums);

		String UltimaLang2 = (String) ListUtil.getUltimo2(langs);
		System.out.println(UltimaLang2);
		
		Integer UltimoNums2 = (Integer) ListUtil.<Integer>getUltimo2(nums);
		System.out.println(UltimoNums2);
	}

}
