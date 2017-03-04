package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonResponsibleLendNodeModule {

    private final PersonResponsibleLendNode owner;

    public PersonResponsibleLendNodeModule(PersonResponsibleLendNode owner) {
        this.owner = owner;
    }

    @Provides @PersonResponsibleLendNodeScope @Owner PersonResponsibleLendNode providePersonResponsibleLendNode() {
        return owner;
    }

    @Provides @PersonResponsibleLendNodeScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner;
    }

    @Provides @PersonResponsibleLendNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonResponsibleLendNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonResponsibleLendNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonResponsibleLendNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

}