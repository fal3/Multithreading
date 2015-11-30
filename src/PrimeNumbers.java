import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {
	public static void main(String[] args) {
		for (int i = 2; i < 25; i++) {
			int number = i;
			PrimeNumbers t = new PrimeNumbers();
			
			System.out.println("The number i = " + number + " It's Prime Factors are ");
			t.generate(number);
			

		}
	}

	// all the factors of a number lets says through numbers 2-25
	// which of those factors are prime numbers for each

	public boolean isPrime(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private void generate(int n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				primeFactors.add(i);
				n /= i;
			}
		}
		for (int i = 0; i < primeFactors.size(); i++) {
			if (i == primeFactors.size() - 1) {
				System.out.println(primeFactors.get(i));
			} else {
				System.out.println(primeFactors.get(i) + ",");
			}
		}
	}

}
