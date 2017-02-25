package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SubmissionNodeModule {

    private final SubmissionNode owner;

    public SubmissionNodeModule(SubmissionNode owner) {
        this.owner = owner;
    }

    @Provides @SubmissionNodeScope @Owner SubmissionNode provideSubmissionNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SubmissionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}