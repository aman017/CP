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
	

		FastReader sc = new FastReader();
		int q = sc.nextInt();
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
		while (q-- > 0) {
			int n = sc.nextInt();
			if (n % 2 != 0) {
				for (int i = 1; i <= n * n; ++i) {
					out.write(i + " ");
					if (i % n == 0)
						out.write("\n");
				}
			} else {
				int k = 1;
				boolean b = true;
				for (int i = 1; i <= n * n; ++i) {
					if (b) {
						out.write(k + " ");
						if (k % n == 0) {
							out.write("\n");
							b = false;
							k += n - 1;
						}
						++k;
					} else {
						out.write(k + " ");
						--k;
						if (k % n == 0) {
							out.write("\n");
							b = true;
							k += n + 1;
						}
					}
				}

			}
		}
		out.flush();

	

}
