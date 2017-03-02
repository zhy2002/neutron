package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsTypeNode_MembersInjector implements MembersInjector<SavingsTypeNode> {
  private final Provider<SavingsTypeNodeComponent.Builder> builderProvider;

  public SavingsTypeNode_MembersInjector(
      Provider<SavingsTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsTypeNode> create(
      Provider<SavingsTypeNodeComponent.Builder> builderProvider) {
    return new SavingsTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsTypeNode instance, Provider<SavingsTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
