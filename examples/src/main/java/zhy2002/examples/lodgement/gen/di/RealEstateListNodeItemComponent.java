package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@RealEstateListNodeItemScope
@Subcomponent(modules = {RealEstateListNodeItemModule.class})
public interface RealEstateListNodeItemComponent {

    RealEstateNode provideRealEstateNode();

}
