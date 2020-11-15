package Question9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Tests {


    @Test
    public void SearchSet_insert_contains_isCorrect(){
        SearchSet a = new SearchSet();
        a.insert(5);
        a.insert(2);
        a.insert(7);
        assert a.contains(7);
        assert a.contains(5);
        assert a.contains(2);
        assert !a.contains(1);

    }

    @Test
    public void SearchSet_getNumberElements_isCorrect(){
        SearchSet a = new SearchSet();
        assert a.getNumberElements() == 0;
        a.insert(5);
        a.insert(2);
        a.insert(7);
        assert a.getNumberElements() == 3;
        a.insert(4);
        assert a.getNumberElements() == 4;
    }

    @Test
    public void FunctionalArray_get_set_isCorrectWhenInRange() {

        FunctionalArray b =new FunctionalArray(5);
        b.set(0,1);
        b.set(1,2);
        b.set(2,3);
        b.set(3,4);
        b.set(4,5);

        for(int i = 0; i< 5; i++){
            assert b.get(i) == i+1;
        }

    }

    @Test
    public void FunctionalArray_get_isCorrectWhenOutOfRange() {
        boolean passed = false;
        FunctionalArray b =new FunctionalArray(5);
        b.set(0,1);
        b.set(1,2);
        b.set(2,3);
        b.set(3,4);
        b.set(4,5);

        try {
            b.get(5);
        } catch (Exception IndexOutOfBoundsException){
            passed = true;
        } finally {
            assert passed;
        }

    }
    @Test
    public void FunctionalArray_set_isCorrectWhenOutOfRange() {
        boolean passed = false;
        FunctionalArray b =new FunctionalArray(5);

        try {
            b.set(10, 3);
        } catch (Exception IndexOutOfBoundsException){
            passed = true;
        } finally {
            assert passed;
        }

    }

    @Test
    public void FunctionalArray_Constructor_isCorrect() {
        boolean passed = false;
        FunctionalArray b =new FunctionalArray(5);

        assert b.get(4) == 0;

        try {
            b.get(5);
        } catch (Exception IndexOutOfBoundsException){
            passed = true;
        } finally {
            assert passed;
        }

    }

}
