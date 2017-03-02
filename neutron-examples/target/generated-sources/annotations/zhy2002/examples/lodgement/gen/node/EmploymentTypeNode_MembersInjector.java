package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmploymentTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeNode_MembersInjector
    implements MembersInjector<EmploymentTypeNode> {
  private final Provider<EmploymentTypeNodeComponent.Builder> builderProvider;

  public EmploymentTypeNode_MembersInjector(
      Provider<EmploymentTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmploymentTypeNode> create(
      Provider<EmploymentTypeNodeComponent.Builder> builderProvider) {
    return new EmploymentTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EmploymentTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmploymentTypeNode instance, Provider<EmploymentTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
