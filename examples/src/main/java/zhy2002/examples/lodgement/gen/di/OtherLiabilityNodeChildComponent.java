package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@OtherLiabilityNodeChildScope
@Subcomponent(modules = {OtherLiabilityNodeChildModule.class})
public interface OtherLiabilityNodeChildComponent {

    OtherLiabilityTypeNode provideOtherLiabilityTypeNode(@Named("otherLiabilityTypeNode") OtherLiabilityTypeNode impl);
    OtherLiabilityDescriptionNode provideOtherLiabilityDescriptionNode(@Named("otherLiabilityDescriptionNode") OtherLiabilityDescriptionNode impl);
    OtherLiabilityMarketValueNode provideOtherLiabilityMarketValueNode(@Named("otherLiabilityMarketValueNode") OtherLiabilityMarketValueNode impl);

}
