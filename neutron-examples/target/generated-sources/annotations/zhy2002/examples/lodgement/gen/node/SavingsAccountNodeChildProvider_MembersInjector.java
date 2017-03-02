package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsAccountNodeChildProvider_MembersInjector
    implements MembersInjector<SavingsAccountNodeChildProvider> {
  private final MembersInjector<SavingsTypeNode> savingsTypeNodeInjectorMembersInjector;

  private final MembersInjector<SavingsInstitutionNameNode>
      savingsInstitutionNameNodeInjectorMembersInjector;

  private final MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjectorMembersInjector;

  private final MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjectorMembersInjector;

  private final MembersInjector<SavingsAccountNameNode>
      savingsAccountNameNodeInjectorMembersInjector;

  private final MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjectorMembersInjector;

  private final MembersInjector<SavingsOwnershipListNode>
      savingsOwnershipListNodeInjectorMembersInjector;

  public SavingsAccountNodeChildProvider_MembersInjector(
      MembersInjector<SavingsTypeNode> savingsTypeNodeInjectorMembersInjector,
      MembersInjector<SavingsInstitutionNameNode> savingsInstitutionNameNodeInjectorMembersInjector,
      MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjectorMembersInjector,
      MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjectorMembersInjector,
      MembersInjector<SavingsOwnershipListNode> savingsOwnershipListNodeInjectorMembersInjector) {
    assert savingsTypeNodeInjectorMembersInjector != null;
    this.savingsTypeNodeInjectorMembersInjector = savingsTypeNodeInjectorMembersInjector;
    assert savingsInstitutionNameNodeInjectorMembersInjector != null;
    this.savingsInstitutionNameNodeInjectorMembersInjector =
        savingsInstitutionNameNodeInjectorMembersInjector;
    assert savingsBalanceNodeInjectorMembersInjector != null;
    this.savingsBalanceNodeInjectorMembersInjector = savingsBalanceNodeInjectorMembersInjector;
    assert savingsAccountNoNodeInjectorMembersInjector != null;
    this.savingsAccountNoNodeInjectorMembersInjector = savingsAccountNoNodeInjectorMembersInjector;
    assert savingsAccountNameNodeInjectorMembersInjector != null;
    this.savingsAccountNameNodeInjectorMembersInjector =
        savingsAccountNameNodeInjectorMembersInjector;
    assert savingsBsbNoNodeInjectorMembersInjector != null;
    this.savingsBsbNoNodeInjectorMembersInjector = savingsBsbNoNodeInjectorMembersInjector;
    assert savingsOwnershipListNodeInjectorMembersInjector != null;
    this.savingsOwnershipListNodeInjectorMembersInjector =
        savingsOwnershipListNodeInjectorMembersInjector;
  }

  public static MembersInjector<SavingsAccountNodeChildProvider> create(
      MembersInjector<SavingsTypeNode> savingsTypeNodeInjectorMembersInjector,
      MembersInjector<SavingsInstitutionNameNode> savingsInstitutionNameNodeInjectorMembersInjector,
      MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjectorMembersInjector,
      MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjectorMembersInjector,
      MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjectorMembersInjector,
      MembersInjector<SavingsOwnershipListNode> savingsOwnershipListNodeInjectorMembersInjector) {
    return new SavingsAccountNodeChildProvider_MembersInjector(
        savingsTypeNodeInjectorMembersInjector,
        savingsInstitutionNameNodeInjectorMembersInjector,
        savingsBalanceNodeInjectorMembersInjector,
        savingsAccountNoNodeInjectorMembersInjector,
        savingsAccountNameNodeInjectorMembersInjector,
        savingsBsbNoNodeInjectorMembersInjector,
        savingsOwnershipListNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SavingsAccountNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.savingsTypeNodeInjector = savingsTypeNodeInjectorMembersInjector;
    instance.savingsInstitutionNameNodeInjector = savingsInstitutionNameNodeInjectorMembersInjector;
    instance.savingsBalanceNodeInjector = savingsBalanceNodeInjectorMembersInjector;
    instance.savingsAccountNoNodeInjector = savingsAccountNoNodeInjectorMembersInjector;
    instance.savingsAccountNameNodeInjector = savingsAccountNameNodeInjectorMembersInjector;
    instance.savingsBsbNoNodeInjector = savingsBsbNoNodeInjectorMembersInjector;
    instance.savingsOwnershipListNodeInjector = savingsOwnershipListNodeInjectorMembersInjector;
  }

  public static void injectSavingsTypeNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsTypeNode> savingsTypeNodeInjector) {
    instance.savingsTypeNodeInjector = savingsTypeNodeInjector;
  }

  public static void injectSavingsInstitutionNameNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsInstitutionNameNode> savingsInstitutionNameNodeInjector) {
    instance.savingsInstitutionNameNodeInjector = savingsInstitutionNameNodeInjector;
  }

  public static void injectSavingsBalanceNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjector) {
    instance.savingsBalanceNodeInjector = savingsBalanceNodeInjector;
  }

  public static void injectSavingsAccountNoNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjector) {
    instance.savingsAccountNoNodeInjector = savingsAccountNoNodeInjector;
  }

  public static void injectSavingsAccountNameNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjector) {
    instance.savingsAccountNameNodeInjector = savingsAccountNameNodeInjector;
  }

  public static void injectSavingsBsbNoNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjector) {
    instance.savingsBsbNoNodeInjector = savingsBsbNoNodeInjector;
  }

  public static void injectSavingsOwnershipListNodeInjector(
      SavingsAccountNodeChildProvider instance,
      MembersInjector<SavingsOwnershipListNode> savingsOwnershipListNodeInjector) {
    instance.savingsOwnershipListNodeInjector = savingsOwnershipListNodeInjector;
  }
}
