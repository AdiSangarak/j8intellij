package in.adi.j8intellij;

public class LambdaPractise
{
    interface MathLambda{
        int operation(int no1,int no2);
    }
    interface StringLambda{
        void outputMessage(String message);
    }

    private int operation(int no1, int no2, MathLambda mathLambda ) {
        return mathLambda.operation(no1, no2);
    }

    private  void outputMessage(String message){
        System.out.println(message);
    }

    public static void main(String args[])
    {
        LambdaPractise lp = new LambdaPractise();
        MathLambda add = (int a,int b) ->a+b;
        MathLambda multiply = (int a,int b) ->a*b;
        MathLambda sub = (int a,int b) ->a-b;
        MathLambda divide = (int a,int b) ->a/b;

        System.out.println("78+39="+lp.operation(78,39,add));
        System.out.println("78*39="+lp.operation(78,39,multiply));
        System.out.println("78-39="+lp.operation(78,39,sub));
        System.out.println("78/39="+lp.operation(78,39,divide));

        StringLambda stringLambda1 = message ->
                System.out.println("Hi " + message);

        StringLambda stringLambda2 = (message) ->
                System.out.println("Hi " + message);

        stringLambda1.outputMessage("Krishna");
        stringLambda2.outputMessage("Sangarak");
    }

}
