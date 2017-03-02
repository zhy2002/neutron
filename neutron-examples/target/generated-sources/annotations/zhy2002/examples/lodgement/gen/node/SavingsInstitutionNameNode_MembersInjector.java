package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SavingsInstitutionNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsInstitutionNameNode_MembersInjector
    implements MembersInjector<SavingsInstitutionNameNode> {
  private final Provider<SavingsInstitutionNameNodeComponent.Builder> builderProvider;

  public SavingsInstitutionNameNode_MembersInjector(
      Provider<SavingsInstitutionNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SavingsInstitutionNameNode> create(
      Provider<SavingsInstitutionNameNodeComponent.Builder> builderProvider) {
    return new SavingsInstitutionNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SavingsInstitutionNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SavingsInstitutionNameNode instance,
      Provider<SavingsInstitutionNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
