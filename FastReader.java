import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FastReader {

	public static void main(String[] args) throws IOException {

		FastReader sc = new FastReader();
		int q = sc.nextInt();
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
		while (q-- > 0) {

			String s = sc.next();
			String p = sc.next();
			int a[] = new int[26];
			int b[] = new int[26];
			for (int i = 0; i < p.length(); i++) {
				++a[p.charAt(i) - 97];
			}
			for (int i = 0; i < s.length(); i++) {
				int k = s.charAt(i) - 97;
				if (a[k] == 0) {
					++b[s.charAt(i) - 97];
				} else {
					--a[k];
				}
			}
			int f = p.charAt(0) - 97;
			StringBuilder o = new StringBuilder();
			for (int i = 0; i <= f; i++) {
				for (int j = 0; j < b[i]; j++) {
					o.append(String.valueOf((char) (i+97)));
				}
			}
			o.append(p);
			for (int i = f + 1; i < 26; i++) {
				for (int j = 0; j < b[i]; j++) {
					o.append(String.valueOf((char) (i+97)));
				}
			}
			out.println(o);

		}
		out.flush();
	}

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}

		public String next() {
			if (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}
	}

}