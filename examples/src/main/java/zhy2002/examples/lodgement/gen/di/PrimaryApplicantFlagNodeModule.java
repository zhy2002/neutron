package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PrimaryApplicantFlagNodeModule {

    private final PrimaryApplicantFlagNode owner;

    public PrimaryApplicantFlagNodeModule(PrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner PrimaryApplicantFlagNode providePrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PrimaryApplicantFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}