package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@ProductsNodeChildScope
@Subcomponent(modules = {ProductsNodeChildModule.class})
public interface ProductsNodeChildComponent {


    @Subcomponent.Builder
    interface Builder {

        Builder setProductsNodeChildModule(ProductsNodeChildModule module);

        ProductsNodeChildComponent build();
    }
}
