*** Settings ***
Documentation     Testing About Tab, Clue Crew page - one youtube video play and pause functionality
...               1
Suite Teardown    Selenium2Library.Close All Browsers
Library           Selenium2Library
*** Test Cases ***
TC2_ProdHomePage
    Open Browser    https://www.sonypictures.com/tv/jeopardy    chrome    options=add_argument("--disable-backgrounding-occluded-windows");add_argument("--headless");add_argument("--disable-gpu");add_argument("--no-sandbox")
    Maximize Browser Window
    sleep    20s
    ${IsElementVisible}=    Get Element Count    //*[@aria-label='Privacy']
    Comment    Run Keyword If    ${IsElementVisible}>0    Selenium2Library.Click Element    //button[contains(text(),'Accept all cookies')]
    ${src}    Selenium2Library.Get Element Attribute    (//img[@class='logo'])[1]    src
    Log to console    ${src}
    ${menu_Items}    Selenium2Library.Get Element Count    //*[@id='block-sonypictures-main-menu']//li
    FOR    ${x}    IN RANGE    1    6
        Mouse over    (//li[@class='nav__item'])[${x}]
    END
