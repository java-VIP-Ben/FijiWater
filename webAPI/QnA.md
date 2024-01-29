 README portion --------------------------------------------------------------------------------
    
This file contains alot of the questions, errors, answers, and fixes that I came across while completing the web API tutorial. I covered all parts of the tutorial, though this time around, I hosted everything from the local machine, rather than using a raspberry pi. 

Errors Portion ----------------------------------------------------------------------------------

(Documented Errors, not the entire tutorial)
    Err No1.) Angular V2 Part 5: In the imports "@import './assets/sass/_global' needs to be './app/assets/sass/_global' instead."
    Err No2.) Angular V2, services:  Provide location of trackBy syntax within the accounts.service.ts file.
    -> Solution: the trackBy code goes inside of the export class in accounts.service.ts.
    Err No3.) (General Error) DO NOT use the --force command option for npm audit. It is probably best to shy away from this command in general. Forcing the audit updated or removed many important files regarding the angular cli and node. 
    -> Solution: Uninstall angular, clear the node and npm caches (with --force this time). Then move your angular files to a new project with the cp -r command, and reinstall an angular version that corresponds with the proper version of node. 


Questions Portion -------------------------------------------------------------------------------

These questions can be pretty general, and might not have a specific location included. With that being said, there are many advantages to understanding and knowing how to solve these errors if they come up. 

    Q No1.) What does router outlet do?
    Q No2.) Why does RouterModule need a .forRoot property?
    Q No3.) What does typescript use [] instead of {}?
    Q No4.) Do typescript files not have a syntax for documentation/ commentary?
    Q No5.) What do the "$" and "``" do in typescript?
    Q No6.) In Angular V1 Pt5, the accounts.service.ts import "import {Account, NewAccount, UpdateAccount}" should be formatted differently in the tutorial. 
    Q No7.) What is "uri" in our typescript files?
    Q No8.) ul & li can be swapped out for "div" but arent in order to keep consistent organization?
    Q No9.) What is .subscribe? (Shown in home.component.ts).
    Q No10.) Some of the variables are highlighted yellow when syntax highlighting is on, where others are not. Why?
    Q No11.) The colorschemes are different than the original vim, students will need to either adjust accordingly or download legacy colors schemes from github. (Vim settings).
    Q No12.) From a development standpoint, how can you tell what dimensions the HTML values need to be? 
    Q No13.) In Login.component.scss, why does the box shadow have so many thicknesses and colors?
    Q No14.) In auth-form.component.scss, what is "z-index: 97 !important"?
    Q No15.) What do the z-index values mean?
    Q No16.) Why wouldnt "this.router.navigate(['home']) use (['/home'])" instead? Same question for the submit btn routes on "acc-form.component.ts."
    Q No17.) Is there a way to organize or show file structure so "ls" commands put all directories first/last?
    Q No18.) Why create a directory called Account, rather than something like "Users" when "Accounts" already exists?
    Q No19.) What exactly does DOM code do?
    Q No20.) How is DOM code accessible to the users?    
    Q No21.) I want to move the input errors outside of the text boxes so the user can easily type in the ID or name without having to dodge the errors. How?
    Q No22.) What needs to be changed to set the submit button to be disabled, but still read if the *field required* errors would show?
