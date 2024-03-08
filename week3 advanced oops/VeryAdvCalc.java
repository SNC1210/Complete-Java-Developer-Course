public class VeryAdvCalc extends AdvCalc {// here we use multileve inheritance concept.

    public double pow(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

//java doesn't support multiple inheritance as their we have seen the ambiguity , so feature is removed but with help of different we way we can achieve the same functionality.