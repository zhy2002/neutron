package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanLenderNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLenderNameNode_MembersInjector
    implements MembersInjector<LoanLenderNameNode> {
  private final Provider<LoanLenderNameNodeComponent.Builder> builderProvider;

  public LoanLenderNameNode_MembersInjector(
      Provider<LoanLenderNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanLenderNameNode> create(
      Provider<LoanLenderNameNodeComponent.Builder> builderProvider) {
    return new LoanLenderNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanLenderNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanLenderNameNode instance, Provider<LoanLenderNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
