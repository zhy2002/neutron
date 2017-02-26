package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class StudentTypeNodeModule {

    private final StudentTypeNode owner;

    public StudentTypeNodeModule(StudentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @StudentTypeNodeScope @Owner StudentTypeNode provideStudentTypeNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}