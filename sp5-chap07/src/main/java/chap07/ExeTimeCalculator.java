package chap07;

public class ExeTimeCalculator implements Calculator {

    private Calculator deligate;

    public ExeTimeCalculator(Calculator deligate) {
        this.deligate = deligate;
    }

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = deligate.factorial(num);
        long end = System.nanoTime();
        System.out.printf("%s.factorial(%d) 실행시간 = %d\n",
                            deligate.getClass().getSimpleName(),
                            num, (end - start));
        return result;
    }
}
