package adapterpattern.again;

import adapterpattern.again.domain.ClassA;
import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.MyRequest;
import adapterpattern.again.domain.ResultClass;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface HandlerAdapter {

    boolean supports(Object handler);

    ResultClass handle(MyRequest myRequest, Object handler);
}
