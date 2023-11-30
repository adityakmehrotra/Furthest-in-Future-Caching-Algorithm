import java.util.*;

public class Furthest_Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInstances = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numInstances; i++) {
            int pageRequests = scanner.nextInt();
            int[] pages = new int[scanner.nextInt()];
            for (int j = 0; j < pages.length; j++) {
                pages[j] = scanner.nextInt();
            }

            System.out.println(helper(pageRequests, pages));

            if (i < numInstances - 1) {
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static int helper(int cacheSize, int[] pageRequests) {
        Set<Integer> cacheSet = new HashSet<>();
        Map<Integer, Integer> futureMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < pageRequests.length; i++) {
            int pageNum = pageRequests[i];

            if (!(cacheSet.contains(pageNum))) {
                if (cacheSet.size() == cacheSize) {
                    int pageToRemove = lastPage(cacheSet, futureMap);
                    cacheSet.remove(pageToRemove);
                }
                cacheSet.add(pageNum);
                count += 1;
            }
            futureMap.put(pageNum, nextIndex(pageNum, pageRequests, i));
        }
        return count - 1;
    }

    private static int lastPage(Set<Integer> cacheSet, Map<Integer, Integer> futureMap) {
        int furthestIndex = -1;
        int furthestPage = -1;

        for (int page : cacheSet) {
            int index = futureMap.get(page);

            if (furthestIndex < index) {
                furthestIndex = index;
                furthestPage = page;
            }
        }

        return furthestPage;
    }

    private static int nextIndex(int pageNum, int[] requestsList, int index) {
        for (int x = index + 1; x < requestsList.length; x++) {
            if (requestsList[x] == pageNum) {
                return x;

            }
        }
        return 0;
    }
}