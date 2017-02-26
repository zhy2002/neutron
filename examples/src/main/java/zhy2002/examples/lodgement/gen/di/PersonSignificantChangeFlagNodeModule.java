package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonSignificantChangeFlagNodeModule {

    private final PersonSignificantChangeFlagNode owner;

    public PersonSignificantChangeFlagNodeModule(PersonSignificantChangeFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PersonSignificantChangeFlagNodeScope @Owner PersonSignificantChangeFlagNode providePersonSignificantChangeFlagNode() {
        return owner;
    }

    @Provides @PersonSignificantChangeFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @PersonSignificantChangeFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonSignificantChangeFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonSignificantChangeFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}