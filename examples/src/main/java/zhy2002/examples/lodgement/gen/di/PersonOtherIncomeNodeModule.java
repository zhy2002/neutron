package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonOtherIncomeNodeModule {

    private final PersonOtherIncomeNode owner;

    public PersonOtherIncomeNodeModule(PersonOtherIncomeNode owner) {
        this.owner = owner;
    }

    @Provides @PersonOtherIncomeNodeScope @Owner PersonOtherIncomeNode providePersonOtherIncomeNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}