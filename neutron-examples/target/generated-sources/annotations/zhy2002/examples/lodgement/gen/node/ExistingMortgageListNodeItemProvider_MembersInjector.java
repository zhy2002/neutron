package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeItemProvider_MembersInjector
    implements MembersInjector<ExistingMortgageListNodeItemProvider> {
  private final MembersInjector<ExistingMortgageNode> existingMortgageNodeInjectorMembersInjector;

  public ExistingMortgageListNodeItemProvider_MembersInjector(
      MembersInjector<ExistingMortgageNode> existingMortgageNodeInjectorMembersInjector) {
    assert existingMortgageNodeInjectorMembersInjector != null;
    this.existingMortgageNodeInjectorMembersInjector = existingMortgageNodeInjectorMembersInjector;
  }

  public static MembersInjector<ExistingMortgageListNodeItemProvider> create(
      MembersInjector<ExistingMortgageNode> existingMortgageNodeInjectorMembersInjector) {
    return new ExistingMortgageListNodeItemProvider_MembersInjector(
        existingMortgageNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ExistingMortgageListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.existingMortgageNodeInjector = existingMortgageNodeInjectorMembersInjector;
  }

  public static void injectExistingMortgageNodeInjector(
      ExistingMortgageListNodeItemProvider instance,
      MembersInjector<ExistingMortgageNode> existingMortgageNodeInjector) {
    instance.existingMortgageNodeInjector = existingMortgageNodeInjector;
  }
}
