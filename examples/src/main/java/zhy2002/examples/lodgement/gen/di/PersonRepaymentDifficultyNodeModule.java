package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonRepaymentDifficultyNodeModule {

    private final PersonRepaymentDifficultyNode owner;

    public PersonRepaymentDifficultyNodeModule(PersonRepaymentDifficultyNode owner) {
        this.owner = owner;
    }

    @Provides @PersonRepaymentDifficultyNodeScope @Owner PersonRepaymentDifficultyNode providePersonRepaymentDifficultyNode() {
        return owner;
    }

    @Provides @PersonRepaymentDifficultyNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @PersonRepaymentDifficultyNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonRepaymentDifficultyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonRepaymentDifficultyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}