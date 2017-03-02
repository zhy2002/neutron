package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageLenderInstitutionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLenderInstitutionNode_MembersInjector
    implements MembersInjector<MortgageLenderInstitutionNode> {
  private final Provider<MortgageLenderInstitutionNodeComponent.Builder> builderProvider;

  public MortgageLenderInstitutionNode_MembersInjector(
      Provider<MortgageLenderInstitutionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageLenderInstitutionNode> create(
      Provider<MortgageLenderInstitutionNodeComponent.Builder> builderProvider) {
    return new MortgageLenderInstitutionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageLenderInstitutionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageLenderInstitutionNode instance,
      Provider<MortgageLenderInstitutionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
