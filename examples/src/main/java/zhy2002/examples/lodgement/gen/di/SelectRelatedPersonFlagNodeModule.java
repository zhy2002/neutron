package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SelectRelatedPersonFlagNodeModule {

    private final SelectRelatedPersonFlagNode owner;

    public SelectRelatedPersonFlagNodeModule(SelectRelatedPersonFlagNode owner) {
        this.owner = owner;
    }

    @Provides @SelectRelatedPersonFlagNodeScope @Owner SelectRelatedPersonFlagNode provideSelectRelatedPersonFlagNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}