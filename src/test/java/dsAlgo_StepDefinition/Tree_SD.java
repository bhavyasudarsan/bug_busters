package dsAlgo_StepDefinition;


import org.testng.Assert;

import dsAlgo_PageObjects.Tree_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_SD {
	 
	Tree_PF tree=  new Tree_PF();
	
	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
		 tree.treeGetStarted();
		
	}

	@When("The user clicks the Overview of Trees button")
	public void the_user_clicks_the_overview_of_trees_button() {
		tree.overviewOfTrees();
	}

	@Then("The user be redirected to the Overview of Trees Page")
	public void the_user_be_redirected_to_the_overview_of_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Overview of Trees");
	}
	
	@Given("The user is in the Overview of Trees page")
	public void the_user_is_in_the_overview_of_trees_page() {
	    tree.treeGetStarted();
	    tree.overviewOfTrees();
	}

	@When("The user clicks Try here button in Overview of Trees page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_page() {
	    tree.tryHere();
	}

	@Then("The tree user should be redirected to the try Editor page with a Run button to test")
	public void the_tree_user_should_be_redirected_to_the_try_editor_page_with_a_run_button_to_test() {
		Assert.assertEquals(tree.getTitle(), "Assessment");
	}
	
	@Given("The user is in the try Editor page from Overview of Trees page")
	public void the_user_is_in_the_try_editor_page() {
	    tree.treeGetStarted();
	    tree.overviewOfTrees();
	    tree.tryHere();
	}

	@When("The tree user clicks the Run button without entering the code in the Editor")
	public void the_tree_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	    tree.run();
	}

	@Then("The tree user should able to see an error message in the alert window")
	public void the_tree_user_should_able_to_see_an_error_message_in_the_alert_window() {
		
		Assert.assertEquals(tree.alertMessage(),tree.expectedOutputFromExcel(3));
	}

	@When("The tree user write invalid python code in the Editor and click Run button")
	public void the_tree_user_write_invalid_python_code_in_the_editor_and_click_run_button() {
	    tree.pythonCodeFromExcel(2);
	}
	
	@Then("The tree user should able to see an error message in the alert window for invalid code")
	public void the_tree_user_should_able_to_see_an_error_message_in_alert_window_for_invalid_code() { 
	   Assert.assertEquals(tree.alertMessage(),tree.expectedOutputFromExcel(2));
	}

	@When("The tree user write valid python code in the Editor and click Run button")
	public void the_tree_user_write_valid_python_code_in_the_editor_and_click_run_button() {
		tree.pythonCodeFromExcel(1);
	}

	@Then("The tree user should able to see output in the console")
	public void the_tree_user_should_able_to_see_output_in_the_console() {
		
		 Assert.assertEquals(tree.output(),tree.expectedOutputFromExcel(1));
	}
	
	@When("The user clicks the Terminologies button")
	public void the_user_clicks_the_terminologies_button() {
	    tree.terminologies();
	}

	@Then("The user be redirected to the {string} page")
	public void the_user_be_redirected_to_the_terminologies_page(String pagename) {
		Assert.assertEquals(tree.getTitle(), pagename);
	}

	@Given("The user is in Terminologies page")
	public void the_user_is_in_terminologies_page() {
	    tree.treeGetStarted();
	    tree.terminologies();
	}

	@When("The user clicks Try here button in Terminologies page")
	public void the_user_clicks_try_here_button_in_terminologies_page() {
	   tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Terminologies page")
	public void the_user_is_in_the_try_editor_page_from_terminologies_page() {
	    tree.treeGetStarted();
	    tree.terminologies();
	    tree.tryHere();
	}

	@When("The user clicks Types of Trees button")
	public void the_user_clicks_types_of_trees_button() {
	    tree.typesOfTrees();
	}

	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_types_of_trees_page(String pagetitle) {
		Assert.assertEquals(tree.getTitle(), pagetitle);
	}

	@Given("The user is in Types of Trees page")
	public void the_user_is_in_types_of_trees_page() {
	    tree.treeGetStarted();
	    tree.typesOfTrees();
	}

	@When("The user clicks Try here button in Types of Trees page")
	public void the_user_clicks_try_here_button_in_types_of_trees_page() {
	    tree.tryHere();
	}

	@Given("The user is in the try Editor page from Types of Trees page")
	public void the_user_is_in_the_try_editor_page_from_types_of_trees_page() {
	   tree.treeGetStarted();
	   tree.typesOfTrees();
	   tree.tryHere();
	}
	
	@When("The user clicks Tree Traversals button")
	public void the_user_clicks_tree_traversals_button() {
	    tree.treeTraversals();
	}

	@Then("The user should be redirected to the Tree Traversals page")
	public void the_user_should_be_redirected_to_the_tree_traversals_page() {
		Assert.assertEquals(tree.getTitle(), "Tree Traversals");
	}

	@Given("The user is in the Tree Traversals page")
	public void the_user_is_in_the_tree_traversals_page() {
	    tree.treeGetStarted();
	    tree.treeTraversals();
	}

	@When("The user clicks Try here button in Tree Traversals page")
	public void the_user_clicks_try_here_button_in_tree_traversals_page() {
	    tree.tryHere();
	}
	@Given("The user is in the try Editor page from Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_from_tree_traversals_page() {
	   tree.treeGetStarted();
	   tree.treeTraversals();
	   tree.tryHere();
	}
	@When("The user clicks Traversals-Illustration button")
	public void the_user_clicks_traversals_illustration_button() {
	    tree.traversalsIllustration();
	}

	@Then("The user should be redirected to the Traversals-Illustration page")
	public void the_user_should_be_redirected_to_the_traversals_illustration_page() {
		Assert.assertEquals(tree.getTitle(), "Traversals-Illustration");
	}

	@Given("The user is in the Traversals-Illustration page")
	public void the_user_is_in_the_traversals_illustration_page() {
	    tree.treeGetStarted();
	    tree.traversalsIllustration();
	}

	@When("The user clicks Try here button in Traversals-Illustration page")
	public void the_user_clicks_try_here_button_in_traversals_illustration_page() {
	    tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Traversals-Illustration page")
	public void the_user_is_in_the_try_editor_page_from_traversals_illustration_page() {
	    tree.treeGetStarted();
	    tree.traversalsIllustration();
	    tree.tryHere();
	}

	@When("The user clicks Binary Trees button")
	public void the_user_clicks_binary_trees_button() {
	    tree.binaryTrees();
	}

	@Then("The user should be redirected to the Binary Trees page")
	public void the_user_should_be_redirected_to_the_binary_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Binary Trees");
	}

	@Given("The user is in the Binary Trees page")
	public void the_user_is_in_the_binary_trees_page() {
	    tree.treeGetStarted();
	    tree.binaryTrees();
	}

	@When("The user clicks Try here button in Binary Trees page")
	public void the_user_clicks_try_here_button_in_binary_trees_page() {
	    tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Binary Trees page")
	public void the_user_is_in_the_try_editor_page_from_binary_trees_page() {
		the_user_is_in_the_binary_trees_page();
		 tree.tryHere();
	}

	@When("The user clicks Types of Binary Trees button")
	public void the_user_clicks_types_of_binary_trees_button() {
	    tree.typesOfBinaryTrees();
	}

	@Then("The user should be redirected to the Types of Binary Trees page")
	public void the_user_should_be_redirected_to_the_types_of_binary_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Types of Binary Trees");
	}

	@Given("The user is in the Types of Binary Trees page")
	public void the_user_is_in_the_types_of_binary_trees_page() {
	    tree.treeGetStarted();
	    tree.typesOfBinaryTrees();
	}

	@When("The user clicks Try here button in Types of Binary Trees page")
	public void the_user_clicks_try_here_button_in_types_of_binary_trees_page() {
	    tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Types of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_from_types_of_binary_trees_page() {
		the_user_is_in_the_types_of_binary_trees_page();
		tree.tryHere();
	}
	
	@When("The user clicks Implementation in Python button")
	public void the_user_clicks_implementation_in_python_button() {
	    tree.implementationInPython();
	}

	@Then("The user should be redirected to Implementation in Python page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		Assert.assertEquals(tree.getTitle(), "Implementation in Python");
	}

	@Given("The user is in the Implementation in Python page")
	public void the_user_is_in_the_implementation_in_python_page() {
	    tree.treeGetStarted();
	    tree.implementationInPython();
	}

	@When("The user clicks Try here button in Implementation in Python page")
	public void the_user_clicks_try_here_button_in_implementation_in_python_page() {
	    tree.tryHere();
	}

	@Given("The user is in the try Editor page from Implementation in Python page")
	public void the_user_is_in_the_try_editor_page_from_implementation_in_python_page() {
		the_user_is_in_the_implementation_in_python_page();
		tree.tryHere();
	}
	
	@When("The user clicks Binary Tree Traversals button")
	public void the_user_clicks_binary_tree_traversals_button() {
	   tree.binaryTreeTraversals();
	}

	@Then("The user should be redirected to Binary Tree Traversals page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		Assert.assertEquals(tree.getTitle(), "Binary Tree Traversals");
	}

	@Given("The user is in the Binary Tree Traversals page")
	public void the_user_is_in_the_binary_tree_traversals_page() {
	   tree.treeGetStarted();
	   tree.binaryTreeTraversals();
	}

	@When("The user clicks Try here button in Binary Tree Traversals page")
	public void the_user_clicks_try_here_button_in_binary_tree_traversals_page() {
	   tree.tryHere();
	}

	@Given("The user is in the try Editor page from Binary Tree Traversals page")
	public void the_user_is_in_the_try_editor_page_from_binary_tree_traversals_page() {
		the_user_is_in_the_binary_tree_traversals_page();
		tree.tryHere();
	}
	
	@When("The user clicks Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button() {
	    tree.implementationOfBinaryTrees();
	}

	@Then("The user should be redirected to Implementation of Binary Trees page")
	public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Implementation of Binary Trees");
	}

	@Given("The user is in the Implementation of Binary Trees page")
	public void the_user_is_in_the_implementation_of_binary_trees_page() {
	    tree.treeGetStarted();
	    tree.implementationOfBinaryTrees();
	}

	@When("The user clicks Try here button in Implementation of Binary Trees page")
	public void the_user_clicks_try_here_button_in_implementation_of_binary_trees_page() {
	   tree.tryHere();
	}

	@Given("The user is in the try Editor page from Implementation of Binary Trees page")
	public void the_user_is_in_the_try_editor_page_from_implementation_of_binary_trees_page() {
		the_user_is_in_the_implementation_of_binary_trees_page();
		tree.tryHere();
	}
	
	@When("The user clicks Applications of Binary trees button")
	public void the_user_clicks_applications_of_binary_trees_button() {
	   tree.applicationsOfBinarytrees();
	}

	@Then("The user should be redirected to Applications of Binary trees page")
	public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Applications of Binary trees");
	}

	@Given("The user is in the Applications of Binary trees page")
	public void the_user_is_in_the_applications_of_binary_trees_page() {
	   tree.treeGetStarted();
	   tree.applicationsOfBinarytrees();
	}

	@When("The user clicks Try here button in Applications of Binary trees page")
	public void the_user_clicks_try_here_button_in_applications_of_binary_trees_page() {
	    tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Applications of Binary trees page")
	public void the_user_is_in_the_try_editor_page_from_applications_of_binary_trees_page() {
		the_user_is_in_the_applications_of_binary_trees_page();
		tree.tryHere();
	}

	@When("The user clicks Binary Search Trees button")
	public void the_user_clicks_binary_search_trees_button() {
	    tree.binarySearchTrees();
	}

	@Then("The user should be redirected to Binary Search Trees page")
	public void the_user_should_be_redirected_to_binary_search_trees_page() {
		Assert.assertEquals(tree.getTitle(), "Binary Search Trees");
	}

	@Given("The user is in the Binary Search Trees page")
	public void the_user_is_in_the_binary_search_trees_page() {
	    tree.treeGetStarted();
	    tree.binarySearchTrees();
	}
	
	@When("The user clicks Try here button in Binary Search Trees page")
	public void the_user_clicks_try_here_button_in_binary_search_trees_page() {
	   tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Binary Search Trees page")
	public void the_user_is_in_the_try_editor_page_from_binary_search_trees_page() {
		the_user_is_in_the_binary_search_trees_page();
		tree.tryHere();
	}

	@When("The user clicks Implementation of BST button")
	public void the_user_clicks_implementation_of_bst_button() {
	   tree.implementationOfBST();
	}
	
	@Then("The user should be redirected to Implementation of BST page")
	public void the_user_should_be_redirected_to_implementation_of_bst_page() {
		Assert.assertEquals(tree.getTitle(), "Implementation Of BST");
	}

	@Given("The user is in the Implementation of BST page")
	public void the_user_is_in_the_implementation_of_bst_page() {
	   tree.treeGetStarted();
	   tree.implementationOfBST();
	}

	@When("The user clicks Try here button in Implementation of BST page")
	public void the_user_clicks_try_here_button_in_implementation_of_bst_page() {
	   tree.tryHere();
	}
	
	@Given("The user is in the try Editor page from Implementation of BST page")
	public void the_user_is_in_the_try_editor_page_from_implementation_of_bst_page() {
		the_user_is_in_the_implementation_of_bst_page();
		tree.tryHere();
	}

	@When("The user clicks Practice Question button")
	public void the_user_clicks_practice_question_button() {
	    tree.practiceQuestions();
	}

	@Then("The user should redirected to the Practice Question page")
	public void the_user_should_redirected_to_the_practice_question_page() {
		Assert.assertEquals(tree.getTitle(), "Practice Questions");
	}
	
	
}