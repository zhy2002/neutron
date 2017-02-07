package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ProductsNodeChildScope
public class ProductsNodeChildModule {

    private final ProductsNode parent;

    public ProductsNodeChildModule(ProductsNode parent) {
        this.parent = parent;
    }


}