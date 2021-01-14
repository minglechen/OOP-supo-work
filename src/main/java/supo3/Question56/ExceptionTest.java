package supo3.Question56;

public class ExceptionTest {
    private void powaux(int x, int v, int n) throws Answer {
        if (n==0) throw new Answer(v);
        else powaux(x,v*x,n-1);
    }
    public int pow(int x, int n) {
        try { powaux(x,1,n); }
        catch(Answer a) { return a.getAns(); }
        return 0;
    }
}