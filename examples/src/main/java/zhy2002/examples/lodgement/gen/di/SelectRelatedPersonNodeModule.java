package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SelectRelatedPersonNodeModule {

    private final SelectRelatedPersonNode owner;

    public SelectRelatedPersonNodeModule(SelectRelatedPersonNode owner) {
        this.owner = owner;
    }

    @Provides @SelectRelatedPersonNodeScope @Owner SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SelectRelatedPersonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}