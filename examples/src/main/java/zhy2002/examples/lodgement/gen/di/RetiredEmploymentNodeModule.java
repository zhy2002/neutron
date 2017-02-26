package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RetiredEmploymentNodeModule {

    private final RetiredEmploymentNode owner;

    public RetiredEmploymentNodeModule(RetiredEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}