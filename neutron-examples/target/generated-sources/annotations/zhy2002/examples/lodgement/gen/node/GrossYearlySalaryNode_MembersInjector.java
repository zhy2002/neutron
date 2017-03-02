package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.GrossYearlySalaryNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GrossYearlySalaryNode_MembersInjector
    implements MembersInjector<GrossYearlySalaryNode> {
  private final Provider<GrossYearlySalaryNodeComponent.Builder> builderProvider;

  public GrossYearlySalaryNode_MembersInjector(
      Provider<GrossYearlySalaryNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<GrossYearlySalaryNode> create(
      Provider<GrossYearlySalaryNodeComponent.Builder> builderProvider) {
    return new GrossYearlySalaryNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(GrossYearlySalaryNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      GrossYearlySalaryNode instance,
      Provider<GrossYearlySalaryNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
