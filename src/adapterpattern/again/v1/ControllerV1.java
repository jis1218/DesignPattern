package adapterpattern.again.v1;

import adapterpattern.again.HandlerAdapter;
import adapterpattern.again.domain.ClassA;
import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.ResultClass;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface ControllerV1 {

    ResultClass process(ClassA a, ClassB b);


}
