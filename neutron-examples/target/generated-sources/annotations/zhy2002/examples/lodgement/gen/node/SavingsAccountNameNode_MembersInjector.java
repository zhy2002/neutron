package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNameNode_MembersInjector
    implements MembersInjector<SavingsAccountNameNode> {
  private final Provider<SavingsAccountNameNodeComponent.Builder> builderProvider;

  public SavingsAccountNameNode_MembersInjector(
      Provider<SavingsAccountNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsAccountNameNode> create(
      Provider<SavingsAccountNameNodeComponent.Builder> builderProvider) {
    return new SavingsAccountNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsAccountNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsAccountNameNode instance,
      Provider<SavingsAccountNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
