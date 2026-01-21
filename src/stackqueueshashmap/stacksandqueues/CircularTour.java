package stackqueueshashmap.stacksandqueues;

class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStart(petrol, distance);
        System.out.println("Start at pump: " + start);
    }
}
