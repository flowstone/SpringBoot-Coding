package java.me.xueyao.chapter01.javaconfig;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
