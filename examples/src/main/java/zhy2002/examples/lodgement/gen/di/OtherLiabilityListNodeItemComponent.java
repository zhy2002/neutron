package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@OtherLiabilityListNodeItemScope
@Subcomponent(modules = {OtherLiabilityListNodeItemModule.class})
public interface OtherLiabilityListNodeItemComponent {

    OtherLiabilityNode provideOtherLiabilityNode();

}
