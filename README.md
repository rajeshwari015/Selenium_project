# Automated Testing Documentation for Venkys.io

👥 **Team Members**: P Rajeshwari, P Priyanandini, Sneha Vellelath

## Table of Contents

- [Introduction](#introduction)
- [System Requirements](#system-requirements)
- [Installation/Setup](#installationsetup)
- [Features & Usage](#features--usage)
- [Common Challenges & Troubleshooting](#common-challenges--troubleshooting)
- [Additional Resources & Support](#additional-resources--support)

## Introduction

Welcome to our Automated Testing Documentation for [Venkys.io](http://Venkys.io), a systematic initiative to ensure every corner of the website functions seamlessly. In today's digital age, with the increasing intricacies of web interfaces and the paramount importance of consistent, top-tier user experiences, we dove into establishing a rigorous testing framework that would stand up to these challenges.

Harnessing the power of Selenium—a premier web testing tool-and Java, one of the most versatile and widely-used programming languages, we've meticulously automated the testing process for Venkys.io. This fusion of Selenium's capabilities with Java's robustness provides a solid foundation, ensuring every single page-from the welcoming ambience of the home page to the intricate functionalities of the login and register pages-is scrutinized and validated with precision.

This documentation is your comprehensive guide to understand the testing process followed and be able to set up the same. You'll gain insights into how each element on the pages—including the home, videos, code, courses, blogs, about, contact, login, and register pages—are tested using Java-coded scripts and Selenium commands.

## System Requirements

Ensuring that you have the right system setup is crucial for the smooth execution of our automated tests for Venkys.io. Below are the detailed hardware and software prerequisites.

### Hardware Requirements

- **Processor (CPU)**: Modern multi-core processor, 2 GHz or faster recommended.
- **Memory (RAM)**: Minimum 4 GB RAM; 8 GB or higher recommended for optimal performance.
- **Disk Space**: At least 5 GB of free disk space for software, logs, and test data.
- **Display**: 1280 x 800 or higher resolution recommended.
- **Internet Connection**: Stable high-speed internet connection for downloading dependencies and accessing Venkys.io during tests.

### Software Requirements

- **Operating System**: Windows 10/11, macOS (10.14 or newer), or Linux (Ubuntu 18.04, 20.04 or compatible distributions).
- **Java Development Kit (JDK)**: JDK 17 or newer (required for executing Java-based Selenium scripts).
- **Browser**: Latest versions of Chrome, Firefox, and Edge. Ensure that you have the corresponding browser drivers for Selenium, like ChromeDriver for Chrome.
- **Integrated Development Environment (IDE)**: Java IDE (Eclipse is used for this project) with Selenium libraries integrated.
- **Selenium WebDriver**: Latest stable version.
- **Additional Dependencies**: Other dependencies like Maven, and Extent Reports are required. Ensure they are set up and configured correctly.

## Installation/Setup

To ensure a smooth testing process on Venkys.io using our automated framework, follow the steps below for a complete installation and setup:

1. **Java Development Kit (JDK) Installation**:
   - Visit the official Oracle website to download the JDK.
   - Choose the version (preferably JDK 17 or newer) compatible with your operating system.
   - Run the installer and follow the on-screen instructions. Ensure to set up the java environment variable.
   - Verify the installation by opening a command prompt or terminal and typing: `java -version`.

2. **Integrated Development Environment (IDE) Setup**:[**Optional**]
   - Download your preferred Java IDE, such as Eclipse.
   - Install and launch the IDE.
   - Configure the IDE to recognize the JDK by pointing it to the JDK installation directory.

   [Download Eclipse](https://www.eclipse.org/downloads/)

3. **Selenium WebDriver Setup**:
   - Visit the official Selenium website and download the latest stable version of Selenium WebDriver.
   - Integrate Selenium libraries into your IDE.

   [Download Selenium WebDriver](https://www.selenium.dev/downloads/)

   Note: Make sure that your Selenium WebDriver version is compatible with your Browser Version

5. **Browser Driver Setup**:
   - Based on the browsers you wish to test on (e.g., Chrome, Firefox), download the corresponding browser drivers.
   - Place the downloaded drivers in a known directory and set their paths as environment variables or directly reference them in your test scripts.

   **Download Browser Drivers**

   [Chrome](https://chromedriver.chromium.org/downloads)

   [Firefox](https://github.com/mozilla/geckodriver/releases)

   [Microsoft Edge](https://www.microsoft.com/en-us/download/drivers)

7. **Additional Dependencies**:
   - If you're using Maven or another dependency management tool, ensure it's installed and properly configured in your IDE.
   - Add other dependencies like Extent Reports by integrating their libraries or including them in your Maven `pom.xml` file.

   [Adding Maven Dependency](https://mvnrepository.com/artifact/org.apache.maven/maven-core)

   [Adding Extentreports Dependency](https://mvnrepository.com/artifact/com.aventstack/extentreports)

   Note: Make sure to download the latest versions

9. **Cloning and Setting Up the Test Repository**:
   - Clone the repository containing the automated tests for Venkys.io.
   - Open the project in your IDE and resolve any dependencies if prompted.
   - Familiarize yourself with the directory structure, test files, and configuration settings.

   [GitHub Repository](https://github.com/venkys-io/Projects/tree/main/Selenium-Testproject)

10. **Test Execution**:
   - Open the test file you wish to run.
   - Right-click and choose Run or use the IDE's test execution command.
   - Monitor the results in the IDE's console or designated output section.

Note: Always ensure you have a stable internet connection when executing tests, especially when accessing and interacting with Venkys.io in real-time.

## Features & Usage

The automated testing framework for Venkys.io has been meticulously designed to comprehensively validate the functionality of every element across the website's pages. Here's an overview of the features, as well as a guide on utilizing them:

Testing of Each below mentioned pages:

1. Login/Register
2. Home
3. Videos
4. Code
5. Courses
6. Blogs
7. About us
8. Contact Us
9. Navigation
10. Footer

**Feature**: Validates all elements, mentioned in the test cases sheet linked below.

[Venkys.io Selenium Testing Manual Report](https://docs.google.com/spreadsheets/d/1tM2ZjKUKyxdzmqhXZLOcb7MpLZhS-oJyTnDXRN4YWdk/edit?usp=sharing)

**Usage**:

1. Navigate to each individual class in your IDE.
2. Run the test suite to execute all tests related to the respective pages.
3. Monitor the results and any screenshots captured during testing for visual verification.

## Common Challenges & Troubleshooting

**Challenge 1**: Selenium WebDriver doesn't launch the browser or throws an error during initialization.

**Cause**: The browser driver (e.g., ChromeDriver for Chrome) might be outdated or incompatible with the browser version.

**Solution**:
- Ensure you've downloaded the latest version of the browser driver.
- Make sure the browser version installed on your system is compatible with the driver.
- Check that the driver's path is correctly set in your test scripts or system environment variables.

**Challenge 2**: Tests fail due to elements not being found on the page.

**Cause**: Web elements might have changed on Venkys.io, or there might be a latency issue causing tests to run before the elements fully load.

**Solution**:
- Utilize XPath locators for elements, as they provide unique identifiers that remain consistent even when element properties change frequently.
- Increase the wait time of the WebDriver using `WebDriverWait` or ensure that the element is in the viewport by scrolling to it using JavaScript.

**Challenge 3**: Timed Element Interactions

**Cause**: Testing Scripts may not wait long enough for elements to appear or may time out prematurely, causing instability in test execution.

**Solution**:
- Use JavaScript actions to interact with elements and improve reliability by ensuring that the script waits for elements to become available.

**Challenge 4**: Compatibility Issues.

**Cause**: Compatibility issues between Selenium, WebDriver, and the browser can lead to unexpected behavior or failures.

**Solution**:
- Manually verify that the Selenium and WebDriver versions are compatible with each other and the browser being used.

**Challenge 5**: Handling Website Variations

**Cause**: Scripts work correctly at times but fail due to variations in website structure or response times

**Solution**:
- Recheck and validate XPath locators, and extend waiting times to ensure elements are clickable, making scripts more robust.

**Challenge 6**: CAPTCHA Automation

**Cause**: Automating tests on websites with CAPTCHA is difficult due to CAPTCHA's anti-automation mechanisms.

**Solution**:
- Currently, there is no known solution for automating CAPTCHA. Manual intervention may be required for CAPTCHA tests.

**Challenge 7**: Ensuring Compatibility with Updates

**Cause**: Keeping test scripts compatible with new versions of drivers, like Chrome updates, is challenging

**Solution**:
- Write test scripts that can run with various versions of drivers, ensuring compatibility across updates

**Challenge 8**: Tests pass locally but fail when run on a different machine or environment.

**Cause**: Environment-specific issues, such as different browser versions, system configurations, or network conditions.

**Solution**:
- Ensure consistent browser versions and drivers across different testing environments.
- Check for any hard-coded paths or configurations in the test scripts and replace them with relative or configurable ones.
- If network issues are suspected, ensure stable connectivity and check for any site access restrictions.

## Additional Resources & Support

- [YouTube Playlist Followed to Configure and Setup the Environment](https://www.youtube.com/playlist?list=PL_UoBvwK4B2W29LccMdpbFYncIYb0Ysd5)
- [Guide for Extent Report for Java](https://www.youtube.com/watch?v=iyV-fDheyD0&list=PLacgMXFs7kl_fz0xHQyBdaFMK8SHBTTSO)
- [Venkys.io Selenium Testing Manual Report](https://docs.google.com/spreadsheets/d/1tM2ZjKUKyxdzmqhXZLOcb7MpLZhS-oJyTnDXRN4YWdk/edit?usp=sharing)
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [Extent reports Documentation](https://www.extentreports.com/documentation/)
