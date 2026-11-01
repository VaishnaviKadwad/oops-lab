import java.util.Scanner;

class MyPoint {
    int x, y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(int a, int b) {
        x = a;
        y = b;
    }

    void setXY(int a, int b) {
        x = a;
        y = b;
    }

    int[] getXY() {
        int arr[] = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    double distance(int a, int b) {
        double dx = x - a;
        double dy = y - b;

        return Math.sqrt(dx * dx + dy * dy);
    }

    double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    double distance() {
        return distance(0, 0);
    }
}

class TestMyPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        MyPoint p1 = new MyPoint();

        System.out.println("Default point: " + p1);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        p1.setXY(x, y);

        System.out.println("Updated point: " + p1);

        int arr[] = p1.getXY();

        System.out.println("X coordinate: " + arr[0]);
        System.out.println("Y coordinate: " + arr[1]);

        System.out.print("Enter another point's x coordinate: ");
        int x2 = sc.nextInt();

        System.out.print("Enter another point's y coordinate: ");
        int y2 = sc.nextInt();

        MyPoint p2 = new MyPoint(x2, y2);

        System.out.println("Distance between points: " + p1.distance(p2));
        System.out.println("Distance from origin: " + p1.distance());
        System.out.println("Distance from given coordinates: " + p1.distance(x2, y2));

        sc.close();
    }
}