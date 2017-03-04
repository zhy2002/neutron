package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ResponsibleMitigationMethodNodeModule {

    private final ResponsibleMitigationMethodNode owner;

    public ResponsibleMitigationMethodNodeModule(ResponsibleMitigationMethodNode owner) {
        this.owner = owner;
    }

    @Provides @ResponsibleMitigationMethodNodeScope @Owner ResponsibleMitigationMethodNode provideResponsibleMitigationMethodNode() {
        return owner;
    }

    @Provides @ResponsibleMitigationMethodNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ResponsibleMitigationMethodNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ResponsibleMitigationMethodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ResponsibleMitigationMethodNodeScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

}