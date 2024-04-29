#!/bin/sh

# Retrieve agent launch information.
# See https://developers.google.com/business-communications/rcs-business-messaging/reference/business-communications/rest/v1/brands.agents/getLaunch

# Agent name format is brands/<brand id>/agents/<agent id>
# Use listAgents.sh to obtain an agent name

BRAND_ID=""
AGENT_ID=""

# Alternatively, you can retrieve the agent launch information with just the agent id
# by setting BRAND_ID = '-'

curl -v "https://businesscommunications.googleapis.com/v1/brands/$BRAND_ID/agents/$AGENT_ID/launch" \
-H "Content-Type: application/json" \
-H "User-Agent: curl/business-messaging" \
-H "`oauth2l header --json serviceAccount.json businesscommunications`" 