package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EmploymentStatusNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStatusNode_MembersInjector
    implements MembersInjector<EmploymentStatusNode> {
  private final Provider<EmploymentStatusNodeComponent.Builder> builderProvider;

  public EmploymentStatusNode_MembersInjector(
      Provider<EmploymentStatusNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmploymentStatusNode> create(
      Provider<EmploymentStatusNodeComponent.Builder> builderProvider) {
    return new EmploymentStatusNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EmploymentStatusNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmploymentStatusNode instance,
      Provider<EmploymentStatusNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
