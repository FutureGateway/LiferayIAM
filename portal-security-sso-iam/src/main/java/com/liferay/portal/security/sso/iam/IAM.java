/**
 * *********************************************************************
 * Copyright (c) 2016: Istituto Nazionale di Fisica Nucleare (INFN), Italy
 * Consorzio COMETA (COMETA), Italy
 *
 * See http://www.infn.it and and http://www.consorzio-cometa.it for details on
 * the copyright holders.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **********************************************************************
 */

package com.liferay.portal.security.sso.iam;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.model.User;

/**
 * @author Marco Fargetta
 */
public interface IAM {
	public User addOrUpdateUser(
			HttpSession session, long companyId, String authorizationCode,
			String returnRequestUri, List<String> scopes)
		throws Exception;

	public String getLoginRedirect(
			long companyId, String returnRequestUri, List<String> scopes)
		throws Exception;

	public boolean isEnabled(long companyId);
}
