package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RetiredOnBenefitFlagNodeModule {

    private final RetiredOnBenefitFlagNode owner;

    public RetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNode owner) {
        this.owner = owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RetiredOnBenefitFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}