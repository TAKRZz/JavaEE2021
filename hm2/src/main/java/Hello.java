
import com.demo.*;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.demo")
public class Hello {
    public static void main(String[] args) {

        SaleService saleService = new SaleService();
        saleService.sell();

        System.out.println("---------Static Proxy---------");
        System.out.println();
        System.out.println();
        SellProxy sellProxy = new SellProxy();
        sellProxy.sell();
        System.out.println();
        System.out.println();
        System.out.println("---------JDK Proxy------------");
        System.out.println();
        JProxy jProxy = new JProxy(saleService);

        Service service = (Service) jProxy.getInstance();
        System.out.println(service.getClass().getName());
        service.sell();
        service.func();

        System.out.println();
        System.out.println();
        System.out.println("---------CGlib Proxy----------");
        CGLibProxy cgLibProxy = new CGLibProxy();
        SaleService sale = (SaleService) cgLibProxy.getInstance(new SaleService());
        System.out.println(sale.getClass().getName());
        sale.sell();
        sale.func();


    }

}
