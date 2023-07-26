package adapterpattern.again.v2;

import adapterpattern.again.HandlerAdapter;
import adapterpattern.again.domain.ClassA;
import adapterpattern.again.domain.ClassB;
import adapterpattern.again.domain.ClassC;
import adapterpattern.again.domain.ResultClass;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface ControllerV2 {

    ResultClass process(ClassB classB, ClassC classC);

}
