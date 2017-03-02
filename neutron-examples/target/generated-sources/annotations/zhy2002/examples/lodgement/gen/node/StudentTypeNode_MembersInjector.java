package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.StudentTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentTypeNode_MembersInjector implements MembersInjector<StudentTypeNode> {
  private final Provider<StudentTypeNodeComponent.Builder> builderProvider;

  public StudentTypeNode_MembersInjector(
      Provider<StudentTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<StudentTypeNode> create(
      Provider<StudentTypeNodeComponent.Builder> builderProvider) {
    return new StudentTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(StudentTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      StudentTypeNode instance, Provider<StudentTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
