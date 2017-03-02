package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.DefenseServiceFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefenseServiceFlagNode_MembersInjector
    implements MembersInjector<DefenseServiceFlagNode> {
  private final Provider<DefenseServiceFlagNodeComponent.Builder> builderProvider;

  public DefenseServiceFlagNode_MembersInjector(
      Provider<DefenseServiceFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<DefenseServiceFlagNode> create(
      Provider<DefenseServiceFlagNodeComponent.Builder> builderProvider) {
    return new DefenseServiceFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(DefenseServiceFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      DefenseServiceFlagNode instance,
      Provider<DefenseServiceFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
