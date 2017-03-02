package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.PlanNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlanNode_MembersInjector implements MembersInjector<PlanNode> {
  private final Provider<PlanNodeComponent.Builder> builderProvider;

  public PlanNode_MembersInjector(Provider<PlanNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PlanNode> create(
      Provider<PlanNodeComponent.Builder> builderProvider) {
    return new PlanNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PlanNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PlanNode instance, Provider<PlanNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
